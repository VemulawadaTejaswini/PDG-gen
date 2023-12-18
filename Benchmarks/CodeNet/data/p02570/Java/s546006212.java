                import java.util.*;
    			import java.math.BigDecimal;
                class Main{
                public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                  int d=sc.nextInt();
                  int t=sc.nextInt();
                  int s=sc.nextInt();
                  BigDecimal bd1 =new BigDecimal(d/s); 
                  //int c=d/s;
                  if(bd1<=t){
                  System.out.println("Yes");
                  }else{
                   System.out.println("No");
                  }
                }
                }