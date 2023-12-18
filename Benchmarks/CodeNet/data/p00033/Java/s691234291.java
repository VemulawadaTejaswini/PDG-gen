import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            boolean first=true,second=true,ok=true;
            int i=0,length=0;
            while ((line = br.readLine()) != null) {
            	if(first){
            		length=Integer.parseInt(line);
            		first=false;
            	}else{
            		String[] ball=line.split(" ");
            		int a[]=new int[ball.length];
            		int b[]=new int[ball.length];
            		int ai=0,bi=0;
            		second=true;
            		ok=true;
            		
            		for(int k=0;k<ball.length;k++){
            			if(second){
            				a[ai]=Integer.parseInt(ball[k]);
            				b[bi]=0;
            				second=false;
            			}else{
            				int s=Integer.parseInt(ball[k]);
            				if(a[ai] < s && b[bi] < s){
            					if(Integer.min(s-a[ai],s-b[bi])==(s-a[ai])){
            						ai++;
            						a[ai]=s;
            					}else{
            						bi++;
            						b[bi]=s;
            					}
            				}else if(a[ai] < s){
            					ai++;
            					a[ai]=s;
            				}else if(b[bi] < s){
            					bi++;
            					b[bi]=s;
            				}else{
            					ok=false;
            					break;
            				}
            			}
            		}
            		if(ok){
            			System.out.println("YES");
            		}else{
            			System.out.println("NO");
            		}
            		i++;
            		if(i==length){
            			break;
            		}
            	}
            }
            
        }
    }
}