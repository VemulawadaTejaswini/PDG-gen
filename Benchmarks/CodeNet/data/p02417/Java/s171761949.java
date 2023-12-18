import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {

        try{
            BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
            int[] rc=new int[26];
            String[] a={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            int sw;
            String dat,str;
              
            while((dat=br.readLine())!=null){
                dat=dat.toLowerCase();
                int i=0;
                while(i<dat.length()){
                    str = dat.substring(i,i+1);
                    int j=0;
                    sw=0;
                    while(sw==0 && j<26){
                        if(str.equals(a[j])){
                            rc[j] ++;
                            sw=1;
                        }else{
                            j++;
                        }
                    }
                    i++;
                } 
            }
            for(int i=0;i<a.length;i++){
                System.out.println(a[i] + " : "+ rc[i]);
            }
        }catch(IOException e){
                e.printStackTrace();
        }
             
}
}