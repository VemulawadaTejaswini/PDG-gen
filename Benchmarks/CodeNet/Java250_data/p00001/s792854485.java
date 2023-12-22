import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Top3{
	int fst=0;
	int snd=0;
	int thd=0;
}

public class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mnt[]=new int[10];
		for(int i=0;i<10;i++){
			String s;
			try {
				s = br.readLine();
				mnt[i]=Integer.parseInt(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Top3 m = new Top3();
		
		for(int i=0;i<10;i++){
			if(mnt[i]>m.fst){
				m.thd = m.snd;
				m.snd = m.fst;
				m.fst = mnt[i];
			}else if(mnt[i]>m.snd){
				m.thd = m.snd;
				m.snd = mnt[i];
			}else if(mnt[i]>m.thd){
				m.thd = mnt[i];
			}
		}
		System.out.println(m.fst);
		System.out.println(m.snd);
		System.out.println(m.thd);
	}
}