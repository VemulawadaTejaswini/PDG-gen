public class Main{

 class static void main(String[] args){
   BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
   
    try{
                String line=reader.readLine();
                int n=Integer.parseInt(line);
                System.out.println(n + "/n");

     }catch (Ioexception e){
      System.out.println(e);
     }

 }


}