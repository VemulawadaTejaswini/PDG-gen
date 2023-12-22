import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a =Integer.parseInt(strArr[0]);
        int b =Integer.parseInt(strArr[1]);
        int c =Integer.parseInt(strArr[2]);
        int d =Integer.parseInt(strArr[3]);
        int e =Integer.parseInt(strArr[4]);

        int chksum=0;

        if(0<=a && 0<=b && 0<=c && 0<=d){
        	if(c+e <= a && d+e <= b && 0<=c-e && 0 <= d-e){
            	System.out.println("Yes");
            	chksum++;
            }
        }

        if(0>=a && 0<=b && 0>=c && 0<=d){
        	if(c+e <= 0 && d+e <= b && a<=c-e && 0 <= d-e){
            	System.out.println("Yes");
            	chksum++;
            }
        }

        if(0>=a && 0>=b && 0>=c && 0>=d){
        	if(c+e <= 0 && d+e <= 0 && a<=c-e && b <= d-e){
            	System.out.println("Yes");
            	chksum++;
            }
        }

        if(0>=a && 0>=b && 0<=c && 0>=d){
        	if(c+e <= a && d+e <= 0 && a<=c-e && b <= d-e){
            	System.out.println("Yes");
            	chksum++;
            }
        }

        if(chksum==0){
        	System.out.println("No");
        }

    }
}