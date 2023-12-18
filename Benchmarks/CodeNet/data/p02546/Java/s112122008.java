import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine().trim());
      	int count=0;
      	for(int i=1;i<=n;i++){
          String s[] = br.readLine().trim().split(" ");
          int a = Integer.parseInt(s[0]);
          int b = Integer.parseInt(s[1]);
          if(a == b){
				count++;
          }
          else{
            	count=0;
          }
          if(count == 3){
            	System.out.println("Yes");
          		break;
          }
        }
      	if(count!=3)
      		System.out.println("No");
    }
}