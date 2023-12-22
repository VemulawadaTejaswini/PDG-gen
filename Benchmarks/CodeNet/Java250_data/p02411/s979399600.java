import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
    boolean i=true;
    while(i){
      String str=br.readLine();
      String[] data=str.split(" ");
      int m=Integer.parseInt(data[0]);
      int f=Integer.parseInt(data[1]);
      int r=Integer.parseInt(data[2]);
      if(m==-1 && f==-1 && r==-1){
        i=false;
      }else if(m!=-1 && f!=-1){
          int score= m + f;
          if(score >=80)  System.out.println("A");
          else if(score >=65)  System.out.println("B");
          else if(score >=50)  System.out.println("C");
          else if(score >=30){
              if(r >=50)  System.out.println("C");
              else  System.out.println("D");
          }else   System.out.println("F");
      }else     System.out.println("F");
    }
    br.close();
}
}