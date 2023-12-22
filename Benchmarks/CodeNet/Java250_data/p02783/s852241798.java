import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
 class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      // List<Integer> l=new ArrayList<>();
      // set<Integer> s=new LinkedSet();
      // int n=sc.nextInt();
      // int flag=0;
      // for(int i=0;i<n;i++){
      //       int j=sc.nextInt();      
      //       l.add(j);      
      // }
      // s.addAll(l);
      // if(l.size()==s.size()){
      //             System.out.println("No");
      //             System.exit(0);
      //       }else{
      //             System.out.println("Yes");
      //             System.exit(0);
      //       }     
      
            int total=sc.nextInt();
            int act=sc.nextInt();
            int count=0;
            if(total==1){
                  System.out.println(total);
                  System.exit(0);
            }else if(act==1){
                  System.out.println(total);
                  System.exit(0);
            }else{
                  while(total>0){
                        total-=act;
                        count++;
                  }
            }     
            System.out.print(count);
      }
}  