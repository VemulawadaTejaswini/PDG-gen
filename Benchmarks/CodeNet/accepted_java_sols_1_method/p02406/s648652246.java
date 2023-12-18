import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int i=0;
        for (i=1;i<n+1;i++){
            if(i%3==0){
                System.out.print(" "+ i);
            }
            else if(Integer.toString(i).contains("3")){
                System.out.print(" "+ i);
            }
        }
        System.out.printf("\n");
    }
}
