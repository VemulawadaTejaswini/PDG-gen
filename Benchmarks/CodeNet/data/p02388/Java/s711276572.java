public class test{
     public static void main(String[] args){
InputStreamReader is = new InputStreamReader(System.in);       
   BufferedReader br = new BufferedReader(is);

int x = 0;

String str = br.readLine();
                x = Integer.parseInt(str);

int i = x^3;

System.out.println(i);




}
}