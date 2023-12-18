import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0;
        int[] k=new int[6];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                k[0]=Integer.parseInt(line);
                k[1]=Integer.parseInt(br.readLine());
                k[2]=Integer.parseInt(br.readLine());
                k[3]=Integer.parseInt(br.readLine());
                k[4]=Integer.parseInt(br.readLine());
                k[5]=Integer.parseInt(br.readLine());
                int min1=Integer.min(Integer.min(k[0],k[1]),Integer.min(k[2],k[3]));
                boolean end=false;
                for(i=0;i<4;i++){
                	if(k[i]==min1&&!end){
                		end=true;
                	}else{
                		sum+=k[i];
                	}
                }
                sum+=Integer.max(k[4],k[5]);
                System.out.println(sum);
                break;
            }
        }
	}

}