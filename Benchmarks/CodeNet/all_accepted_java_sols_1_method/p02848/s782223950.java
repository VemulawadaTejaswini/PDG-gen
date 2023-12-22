import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		String ans = "";
		for(int i = 0;i<S.length();i++) {
			String s = S.substring(i,i+1);
			int sn=0;
			if(s.equals("A"))sn=0;
			if(s.equals("B"))sn=1;
			if(s.equals("C"))sn=2;
			if(s.equals("D"))sn=3;
			if(s.equals("E"))sn=4;
			if(s.equals("F"))sn=5;
			if(s.equals("G"))sn=6;
			if(s.equals("H"))sn=7;
			if(s.equals("I"))sn=8;
			if(s.equals("J"))sn=9;
			if(s.equals("K"))sn=10;
			if(s.equals("L"))sn=11;
			if(s.equals("M"))sn=12;
			if(s.equals("N"))sn=13;
			if(s.equals("O"))sn=14;
			if(s.equals("P"))sn=15;
			if(s.equals("Q"))sn=16;
			if(s.equals("R"))sn=17;
			if(s.equals("S"))sn=18;
			if(s.equals("T"))sn=19;
			if(s.equals("U"))sn=20;
			if(s.equals("V"))sn=21;
			if(s.equals("W"))sn=22;
			if(s.equals("X"))sn=23;
			if(s.equals("Y"))sn=24;
			if(s.equals("Z"))sn=25;
			sn+=N;
			if(sn%26==0)ans+="A";
			if(sn%26==1)ans+="B";
			if(sn%26==2)ans+="C";
			if(sn%26==3)ans+="D";
			if(sn%26==4)ans+="E";
			if(sn%26==5)ans+="F";
			if(sn%26==6)ans+="G";
			if(sn%26==7)ans+="H";
			if(sn%26==8)ans+="I";
			if(sn%26==9)ans+="J";
			if(sn%26==10)ans+="K";
			if(sn%26==11)ans+="L";
			if(sn%26==12)ans+="M";
			if(sn%26==13)ans+="N";
			if(sn%26==14)ans+="O";
			if(sn%26==15)ans+="P";
			if(sn%26==16)ans+="Q";
			if(sn%26==17)ans+="R";
			if(sn%26==18)ans+="S";
			if(sn%26==19)ans+="T";
			if(sn%26==20)ans+="U";
			if(sn%26==21)ans+="V";
			if(sn%26==22)ans+="W";
			if(sn%26==23)ans+="X";
			if(sn%26==24)ans+="Y";
			if(sn%26==25)ans+="Z";
		}
		System.out.println(ans);
	}
}
