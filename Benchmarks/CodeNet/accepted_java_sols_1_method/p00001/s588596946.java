import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[10];
        int i=0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String tokens = line;
                arg[i] = Integer.parseInt(tokens);
                i++;
            }
        }



		int[] store=new int[3];
		for(i=0;i<10;i++){
			int s=arg[i];
			for(int j=0;j<3;j++){
				if(s>store[j]){
					if(j==0){
						store[j+2]=store[j+1];
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else if(j==1){
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else{
						store[j]=s;
					}
				}
			}
		}
		for(i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
	}

}