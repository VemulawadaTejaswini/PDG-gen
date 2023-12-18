import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int i=0;
        int [] num = new int[n];


        for(i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }


        for(i = n-1; i >= 0; i--){
            if(i != 0){
                System.out.print(num[i]);
		System.out.print(" ");
                  
            }else{
                break;
            }
        }
 		System.out.println(num[i]);
    }
}
