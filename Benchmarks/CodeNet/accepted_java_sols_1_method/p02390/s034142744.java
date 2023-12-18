import java.io.*;

public interface Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int  num=Integer.parseInt(str);
    
    int h=num/3600;           
    int m=(num%3600)/60;
    int s=(num%3600)%60;
    
    System.out.println(h+":"+m+":"+s);
    
    }
    
}