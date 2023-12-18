import java.util.HashMap;
import java.util.Scanner;

public class Main {
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	String ans[];
	String input[][];
	public static void main(String[] args) {
		//new AOJ2188().run();
		new Main().run();
	}
	void run(){
		hm.put("yotta", 24);
		hm.put("zetta", 21);
		hm.put("exa", 18);
		hm.put("peta", 15);
		hm.put("tera", 12);
		hm.put("giga", 9);
		hm.put("mega", 6);
		hm.put("kilo", 3);
		hm.put("hecto", 2);
		hm.put("deca", 1);
		hm.put("nomal", 0);
		hm.put("deci", -1);
		hm.put("canti", -2);
		hm.put("milli", -3);
		hm.put("micro", -6);
		hm.put("nano", -9);
		hm.put("pico", -12);
		hm.put("femto", -15);
		hm.put("ato", -18);
		hm.put("zepto", -21);
		hm.put("yocto", -24);

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			input=new String[n][];
			ans=new String[n];
			sc.nextLine();
			for(int i=0; i<n; i++){
				input[i]=sc.nextLine().split(" ");
				if(input[i].length==2){
					String str[]=new String[3];
					str[0]=input[i][0];
					str[1]="nomal";
					str[2]=input[i][1];
					input[i]=new String[3];
					input[i][0]=str[0];
					input[i][1]=str[1];
					input[i][2]=str[2];
				}
				if(!input[i][0].contains(".")){
					input[i][0]=new String(input[i][0]+".");
				}
			}
			
			for(int i=0; i<n; i++){
				int unit=hm.get(input[i][1]);
				if(!check1(input[i][0])){
					converter1(input[i][0], unit, i);
				}
				else if(!check2(input[i][0])){
					converter2(input[i][0], unit, i);
				}
			}
			for(int i=0; i<n; i++){
				System.out.println(ans[i]);
			}
		}
	}
	void converter1(String str,int unit,int index){
		char ch[]=str.toCharArray();
		unit--;
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='.'){
				ch[i]=ch[i+1];
				ch[i+1]='.';
				break;
			}
		}
		String temp=zero(String.valueOf(ch));
		if(!check1(temp)){
			converter1(temp,unit, index);
		}
		else{
			//完成
			ans[index]=temp+" * 10^"+Integer.toString(unit)+" "+input[index][2];
		}
	}
	void converter2(String str,int unit,int index){
		char ch[]=str.toCharArray();
		unit++;
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='.'){
				ch[i]=ch[i-1];
				ch[i-1]='.';
				break;
			}
		}
		if(!check2(String.valueOf(ch))){
			converter2(String.valueOf(ch),unit, index);
		}
		else{
			//完成
			ans[index]=String.valueOf(ch)+" * 10^"+Integer.toString(unit)+" "+input[index][2];
		}
	}
	boolean check1(String str){
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='.'){
				if(ch[0]=='0'){
					return false;
				}
			}
		}
		return true;
	}
	//実はこのチェック危険。もし001.23とかも10超えと判定してしまう。
	boolean check2(String str){
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='.'){
				if(1<i){
					return false;
				}
			}
		}
		return true;
	}
	String zero(String str){
		//System.out.println("zero");
		char ch[]=str.toCharArray();
		int n=ch.length;
		
		for(int i=0; i<n; i++){
			if(ch[i]=='0' && ch[i+1]!='.'){
				for(int j=i; j<n-1; j++){
					ch[j]=ch[j+1];
				}
				ch[n-1]=0;
				n--;
			}
			if(ch[i]=='.'){
				if(ch[i+1]==0)
					ch[i]=0;
				break;
			}
		}
		
		return String.valueOf(ch);
	}

}