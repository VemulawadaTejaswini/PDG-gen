
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
class Main{
    static public void  main(String[] av){
        int sum=0;

        Scanner sc =new Scanner(System.in);
       // int n =sc.nextInt();
int ch =1;
List<Integer> intlist = new ArrayList<Integer>();
List<Integer> stack = new ArrayList<Integer>();
String ss= sc.nextLine();

String[] f = ss.split(" ", 0);
/*
for(int k =0;k<f.length ;k++) {
    System.out.println(f[k]);
}
*/

for(int k =0;k<f.length ;k++) {
    String s= f[k];
/*
    if (s==null){
        ch=0;
        break;
    }
    */
    if (s.contains("+")){
       intlist.add(-1);
       
        continue;
    }
    if (s.contains("-")){
        intlist.add(-2);
        
        continue;
    }
    if (s.contains("*")){
        intlist.add(-3);
       
        
        continue;
    }
    if (s.contains("/")){
        intlist.add(-4);
       
        continue;
    }
    intlist.add(Integer.valueOf(s));
   
    }

    for(int i=0;i<f.length;i++){
        if ( intlist.get(i)>=0){
            stack.add(intlist.get(i));
                }
        else{
            int v1= stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            int v2= stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            if (intlist.get(i)==(-1)){
                stack.add(v2+v1);
            }
            else if (intlist.get(i)==(-2)){
                stack.add(v2-v1);
            }
            else if (intlist.get(i)==(-3)){
                stack.add(v2*v1);
            }
            else if (intlist.get(i)==(-4)){
                stack.add(v2/v1);
            }
        }
    }
    System.out.println(stack.get(0));

}

}





