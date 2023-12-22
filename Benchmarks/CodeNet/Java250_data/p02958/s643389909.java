import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        int count = 0;

        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
            if(!(array[i] == (i + 1))){
                count++;
            }
        }
        if(count <= 2){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	}
}