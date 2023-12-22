import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b =  new int[a];
        for(int i=0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int count =0;
        two: for(int j =0; j < a ; j++){
            for(int k =0; k < j; k++){
                if(b[k] > b[j]){
                    continue two;
                }
                
            }
                count++;
        }
        System.out.println(count);
    }
}
