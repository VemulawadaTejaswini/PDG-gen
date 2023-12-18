import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i,j,k;
        Scanner sc= new Scanner(System.in);

        while(true){
            int n= sc.nextInt();
            int x=sc.nextInt(); 

            if(n==0&&x==0){
                break;
            }

            int time=0;

            for(i=2;i<n;i++){
                for(j=1;j<i;j++){
                    for(k=0;k<j;k++){
                        if(x==i+j+k+3){
                            time++;
                        }
                    }
                }
            }
            System.out.println(time);
        }
    }    
}
