import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int solution = 0;
        if(a!=0 && b!=0 && c!=0){
            for(int  i = a; i>=0; i--){
                for(int j = b; j>=0; j--){
                    for(int k = c; k>=0; k--){
                        if((500*i)+(100*j)+(50*k)==x) solution++;
                    }
                }
            }
        }else if(a!=0 && b!=0 && c==0){
            for(int  i = a; i>=0; i--){
                for(int j = b; j>=0; j--){
                    if((500*i)+(100*j)==x) solution++;
                }
            }
        }else if(a!=0 && b==0 && c!=0){
            for(int  i = a; i>=0; i--){
                for(int j = c; j>=0; j--){
                    if((500*i)+(50*j)==x) solution++;
                }
            }
        }else if(a!=0 && b==0 && c==0){
            for(int  i = a; i>=0; i--){
                if(500*i==x) solution++;
            }
        }else if(a==0 && b!=0 && c!=0){
            for(int  i = b; i>=0; i--){
                for(int j = c; j>=0; j--){
                    if((100*i)+(50*j)==x) solution++;
                }
            }
        }else if(a==0 && b!=0 && c==0){
            for(int  i = b; i>=0; i--){
                if((100*i)==x) solution++;
            }
        }else if(a==0 && b==0 && c!=0){
            for(int  i = c; i>=0; i--){
                if(50*i==x) solution++;
            }
        }else{
            System.out.println(solution); 
        }
        System.out.println(solution);
    }
}