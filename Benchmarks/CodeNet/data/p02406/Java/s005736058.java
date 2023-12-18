import java.util.*;		
class Main{		
    public static void main(String[] args){		
        Scanner input=new Scanner(System.in);		
        int n,i,a;		
        n=input.nextInt();		
            for(i = 1; i <= n; i++){		
                a=i;		
                if((a%3) == 0)		
                    System.out.print(" "+i);		
                else{		
                for(;a >= 1;){		
                    if((a%10) == 3){		
                        System.out.print(" "+i);		
                        a=0;		
                    }		
                    a=a/10;		
                }		
                }		
            }		
            System.out.println();		
    }		
}		
