import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int way =0 ;
            if(a==0&&b==0){
                break;
            }
            for(int i=1;i<=a-2;i++){
                for(int j=i+1;j<=a-1;j++){
                    for(int k=j+1;k<=a;k++){
                        if(i+j+k==b){
                            way++;
                        }
                    }
                }
            }
            System.out.println(way);
        }
        sc.close(); 
    }
}
