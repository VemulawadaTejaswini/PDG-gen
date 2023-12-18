import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[]=in.nextLine().toCharArray();
			String st="";
			String ans="";
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==' ')
					st+="101";
				else if(ch[i]=='\'')
					st+="000000";
				else if(ch[i]==',')
					st+="000011";
				else if(ch[i]=='-')
					st+="10010001";
				else if(ch[i]=='.')
					st+="010001";
				else if(ch[i]=='?')
					st+="000001";
				else if(ch[i]=='A')
					st+="100101";
				else if(ch[i]=='B')
					st+="10011010";
				else if(ch[i]=='C')
					st+="0101";
				else if(ch[i]=='D')
					st+="0001";
				else if(ch[i]=='E')
					st+="110";
				else if(ch[i]=='F')
					st+="01001";
				else if(ch[i]=='G')
					st+="10011011";
				else if(ch[i]=='H')
					st+="010000";
				else if(ch[i]=='I')
					st+="0111";
				else if(ch[i]=='J')
					st+="10011000";
				else if(ch[i]=='K')
					st+="0110";
				else if(ch[i]=='L')
					st+="00100";
				else if(ch[i]=='M')
					st+="10011001";
				else if(ch[i]=='N')
					st+="10011110";
				else if(ch[i]=='O')
					st+="00101";
				else if(ch[i]=='P')
					st+="111";
				else if(ch[i]=='Q')
					st+="10011111";
				else if(ch[i]=='R')
					st+="1000";
				else if(ch[i]=='S')
					st+="00110";
				else if(ch[i]=='T')
					st+="00111";
				else if(ch[i]=='U')
					st+="10011100";
				else if(ch[i]=='V')
					st+="10011101";
				else if(ch[i]=='W')
					st+="000010";
				else if(ch[i]=='X')
					st+="10010010";
				else if(ch[i]=='Y')
					st+="10010011";
				else if(ch[i]=='Z')
					st+="10010000";
			}
			while(st.length()%5!=0)
				st+="0";
			while(st.length()>0)
			{
				String tmp=st.substring(0, 5);
				st=st.substring(5, st.length());
				
				if(tmp.equals("00000"))
					ans+="A";
				else if(tmp.equals("00001"))
					ans+="B";
				else if(tmp.equals("00010"))
					ans+="C";
				else if(tmp.equals("00011"))
					ans+="D";
				else if(tmp.equals("00100"))
					ans+="E";
				else if(tmp.equals("00101"))
					ans+="F";
				else if(tmp.equals("00110"))
					ans+="G";
				else if(tmp.equals("00111"))
					ans+="H";
				
				else if(tmp.equals("01000"))
					ans+="I";
				else if(tmp.equals("01001"))
					ans+="J";
				else if(tmp.equals("01010"))
					ans+="K";
				else if(tmp.equals("01011"))
					ans+="L";
				else if(tmp.equals("01100"))
					ans+="M";
				else if(tmp.equals("01101"))
					ans+="N";
				else if(tmp.equals("01110"))
					ans+="O";
				else if(tmp.equals("01111"))
					ans+="P";
				
				else if(tmp.equals("10000"))
					ans+="Q";
				else if(tmp.equals("10001"))
					ans+="R";
				else if(tmp.equals("10010"))
					ans+="S";
				else if(tmp.equals("10011"))
					ans+="T";
				else if(tmp.equals("10100"))
					ans+="U";
				else if(tmp.equals("10101"))
					ans+="V";
				else if(tmp.equals("10110"))
					ans+="W";
				else if(tmp.equals("10111"))
					ans+="X";
				
				
				else if(tmp.equals("11000"))
					ans+="Y";
				else if(tmp.equals("11001"))
					ans+="Z";
				else if(tmp.equals("11010"))
					ans+=" ";
				else if(tmp.equals("11011"))
					ans+=".";
				else if(tmp.equals("11100"))
					ans+=",";
				else if(tmp.equals("11101"))
					ans+="-";
				else if(tmp.equals("11110"))
					ans+="'";
				else if(tmp.equals("11111"))
					ans+="?";
			}
			System.out.println(ans);
		}
	}
}