import java.util.Scanner
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i,j;
        if(a==0 && b==0){
            return;
        }


        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.printf("#");
            }
            System.out.println("");
        }
    }
}
