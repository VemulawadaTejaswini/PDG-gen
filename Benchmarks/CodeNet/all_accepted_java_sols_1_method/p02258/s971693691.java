import java.util.Scanner;

/**
 * A4
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        int[] store = new int[len]; 
        int[] min = new int[len];
        for(int i=0; i<len; i++){
            store[i] = sc.nextInt();
            if(i==0 || min[i-1] > store[i]){
                min[i] = store[i];
            }
            else{
                min[i] = min[i-1];
            }
        }
        sc.close();
        int currentMax=0;
        int resultMax = (int) -Math.pow(10, 9);
        for(int i=len-1; i>0; i--){
            if(currentMax<store[i]){
                currentMax = store[i];
            }
            if(resultMax < (currentMax-min[i-1])){
                resultMax = (currentMax-min[i-1]);
            }
        }
        System.out.println(resultMax);
    }
}
