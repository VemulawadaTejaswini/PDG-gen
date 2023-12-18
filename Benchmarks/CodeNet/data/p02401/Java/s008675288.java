import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   
   while(true){   
    String str = br.readLine(); 
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]); 
    String op = strAry[1];
    int b = Integer.parseInt(strAry[2]);
 
     if(op.equals("+")){
       System.out.println(a+b);
     }else if(op.equals("-")){
       System.out.println(a-b);
     }else if(op.equals("*")){
       System.out.println(a*b);
     }else if(op.equals("/'")){
       System.out.println(a/b);
     }else if(op.equals("?")){ 
       break;
     }
   }   

  }
}