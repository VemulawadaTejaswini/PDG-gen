import java.util.*;

class Question {
	int num;
	//AC=0,WA=1
	ArrayList<Integer> ansstack = new ArrayList<Integer>();
	public Question(int n) {
		num=n;
	}
	
	public void addAC() {
		ansstack.add(0);
	}
	
	public void addWA() {
		ansstack.add(1);
	}
	
	public void printStack() {
		for(int i=0;i<ansstack.size();i++) {
			System.out.print(ansstack.get(i));
		}
		System.out.println();
	}
	
	public int checkWA() {
		int tmp=0;
		for(int i=0;i<ansstack.size();i++) {
			if(ansstack.get(i)==1) tmp+=1;
			else if(ansstack.get(i)==0) return tmp;
		}
		return 0;
	}
	public int checkAC() {
		int tmp=0;
		for(int i=0;i<ansstack.size();i++) {
			if(ansstack.get(i)==0) return 1;
		}
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] p=new int[m];
		String[] s=new String[m];
		
		long ans_num=0;
		long pena_num=0;
		
		Question[] toi=new Question[n];
		
		for(int i=0;i<n;i++) {
			toi[i]=new Question(i);
		}
		
		for(int i=0;i<m;i++) {
			p[i] = sc.nextInt();
			s[i] = sc.next();
		}	
		
		for(int i=0;i<m;i++) {
			if(s[i].equals("AC")) {
				toi[p[i]-1].addAC();
			}
			else if(s[i].equals("WA")) {
				toi[p[i]-1].addWA();
			}
		}
		
		for(int i=0;i<n;i++) {
			ans_num+=toi[i].checkAC();
			pena_num+=toi[i].checkWA();
		}
		
		System.out.println(ans_num+" "+pena_num);
	}
}