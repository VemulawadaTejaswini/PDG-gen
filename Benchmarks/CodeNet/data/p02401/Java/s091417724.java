import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int a,b;
  String op;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   
   while(true){   
    String str = br.readLine(); 
    String[] strAry = str.split(" ");
    a = Int.parseInt(strAry[0]); 
    op = String.parseString(strAry[1]);
    b = Int.parseInt(strAry[2]);
 
     if(op == '+'){
       System.out.println(a+b);
     }else if(op == '-'){
       System.out.println(a-b);
     }else if(op == '*'){
       System.out.println(a*b);
     }else if(op == '/'){
       System.out.println(a/b);
     }else if(op == '?'){ 
       break;
     }
   }   

  }
}