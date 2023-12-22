import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
          
        int n=Integer.parseInt(br.readLine());
        int [] in=new int[n];
        int max=Integer.MIN_VALUE;
        int mini=0;  
        for(int i=0;i<n;i++)
            in[i]=Integer.parseInt(br.readLine());
              
        for(int i=0;i<n-1;i++){if(in[i]>in[mini])continue;
            for(int j=i+1;j<n;j++){
                int tmp=in[j]-in[i];
                if(tmp>max) {max=tmp;mini=i;}
            }
        }
System.out.println(max);
  
  
  
  
    }
  
}