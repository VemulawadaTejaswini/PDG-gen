import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,result="";
            boolean first=true;
            int n=0,i=0,taro=0,hana=0;
            while ((line = br.readLine()) != null) {
            	if(first){
            		result=line;
            		n=Integer.parseInt(br.readLine());
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		int a=Integer.parseInt(str[1]);
            		int b=Integer.parseInt(str[2]);
            		if(str[0].equals("replace")){
            			if(a==0){
            				result=str[3]+result.substring(b+1, result.length());
            			}else if(b==result.length()-1){
            				result=result.substring(0, a)+str[3];
            			}else{
            				result=result.substring(0, a)+str[3]+result.substring(b+1, result.length());
            			}
            		}else if(str[0].equals("reverse")){
            			if(a==0){
            				result=new StringBuilder(result.substring(a,b+1)).reverse().toString()+result.substring(b+1,result.length());
            			}else if(b==result.length()-1){
            				result=result.substring(0, a)+new StringBuilder(result.substring(a,b+1)).reverse().toString();
            			}else{
            				result=result.substring(0, a)+new StringBuilder(result.substring(a,b+1)).reverse().toString()+result.substring(b+1,result.length());
            			}
            		}else if(str[0].equals("print")){
            			System.out.println(result.substring(a,b+1));
            		}
            		
            		i++;
            		if(i==n){
            			break;
            		}
            	}
            	
            }
        }
    }

}