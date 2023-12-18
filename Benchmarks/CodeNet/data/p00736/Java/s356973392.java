import java.io.*;

public class Main {

	static char[] key = new char[100];
	static int[] vari = new int[3];
	static int idx;
	static int cnt;
	
	static int formula(){
		
		if(key[idx]=='0'||key[idx]=='1'||key[idx]=='2'){
			return (int)key[idx]-'0';
		}
		else if(key[idx]=='P'){
			return vari[0];
		}
		else if(key[idx]=='Q'){
			return vari[1];
		}
		else if(key[idx]=='R'){
			return vari[2];
		}
		else if(key[idx]=='-'){
			idx++;
			int tmp = formula();
			return 2-tmp;
		}
		else if(key[idx]=='('){
			idx++;
			int tmp1=formula();
			idx++;
			int op = key[idx];
			idx++;
			int tmp2 =formula();
			idx++;
			if(op=='*'){
				if(tmp1==2&&tmp2==2){
					return 2;
				}
				else if(tmp1>=1&&tmp2>=1){
					return 1;
				}
				else{
					return 0;
				}
			}
			else if(op=='+'){
				if(tmp1==0&&tmp2==0){
					return 0;
				}
				else if(tmp1==2||tmp2==2){
					return 2;
				}
				else{
					return 1;
				}
			}
		}
		return -100;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String a = stdIn.readLine();
			key = a.toCharArray();
			if(key[0]=='.'){
				return;
			}
			idx=0;
			cnt=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					for(int k=0;k<3;k++){
						vari[0]=i;
						vari[1]=j;
						vari[2]=k;
						idx=0;
						int result=formula();
						if(result==2){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}