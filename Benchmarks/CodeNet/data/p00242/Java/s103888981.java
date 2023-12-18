
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String  NN =br.readLine();
			int N = Integer.parseInt(NN);
			if(N==0){
				break;
			}
			String[] s= {"@"};
			for(int i =0;i<N;i++){
				String strr = br.readLine();
				String[] tmp = strr.split(" ");
				String[] tmp2=s.clone();
				s=new String[tmp.length+tmp2.length];
				for(int j = 0;j<tmp.length;j++){
					s[j]=tmp[j].toString();
				}
				for(int j = tmp.length;j<s.length;j++){
					s[j]=tmp2[j-tmp.length].toString();
				}
			}
			
			Arrays.sort(s);
			for(int i = 0;i<s.length;i++){
				//System.out.println(s[i]);
			}
			Candid[] candid = new Candid[s.length-1];
			int cnt=0;
			for(int i = 1;i<s.length;i++){
				if(s[i].equals(s[i-1])){
					candid[cnt-1].count++;
				}
				else{
					candid[cnt++]=new Candid(s[i]);
				}
			}
			Candid[] tmp = candid.clone();
			candid = new Candid[cnt];
			for(int i = 0;i<cnt;i++){
				candid[i]=tmp[i];
			}
			Arrays.sort(candid);
			for(int i = 0;i<cnt;i++){
				//System.out.println(candid[i]);
			}
			String key =br.readLine();
			cnt=0;
			for(int j = 0;j<candid.length;j++){
				if(key.charAt(0)==candid[j].word.charAt(0)){
					if(cnt==0){
						System.out.print(candid[j].word);
					}
					else{
						System.out.print(" "+candid[j].word);
					}
					
					cnt++;
				}
				if(cnt==5){
					break;
				}
			}
			if(cnt==0){
				System.out.print("NA");
			}
			System.out.println();
		}
	}

}
class Candid implements Comparable{
	String word;
	int count;
	Candid(String s){
		word=s;
		count=1;
	}
	public int compareTo(Object o) {
		Candid c = (Candid)o;
		if(this.count!=c.count){
			return c.count-this.count;
		}
		else{
			return this.word.compareTo(c.word);
		}
	}
	public String toString(){
		return word+" "+count;
	}
}