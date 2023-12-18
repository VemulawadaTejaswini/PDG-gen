import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = 0,w = 0,e = 0,r = 0,t = 0,y = 0,u = 0,i = 0,o = 0,p = 0,a = 0,s = 0,d = 0,f = 0,g = 0,h = 0,j = 0,k = 0,l = 0,z = 0,x = 0,c = 0,v=0,b = 0,n = 0,m = 0;

		while(true){
			String str =br.readLine();
			if(str.equals(""))
				break;
			char[] ch = str.toCharArray();


			for(int count = 0; count < str.length(); count++){
				if(ch[count] =='a' || ch[count] == 'A'){
					a++;
				}else if(ch[count] =='b'|| ch[count] == 'B'){
					b++;
				}else if(ch[count] =='c'|| ch[count] == 'C'){
					c++;
				}else if(ch[count] =='d'|| ch[count] == 'D'){
					d++;
				}else if(ch[count] =='e'|| ch[count] == 'E'){
					e++;
				}else if(ch[count] =='f'|| ch[count] == 'F'){
					f++;
				}else if(ch[count] =='g'|| ch[count] == 'G'){
					g++;
				}else if(ch[count] =='h'|| ch[count] == 'H'){
					h++;
				}else if(ch[count] =='i'|| ch[count] == 'I'){
					i++;
				}else if(ch[count] =='j'|| ch[count] == 'J'){
					j++;
				}else if(ch[count] =='k'|| ch[count] == 'K'){
					k++;
				}else if(ch[count] =='l'|| ch[count] == 'L'){
					l++;
				}else if(ch[count] =='m'|| ch[count] == 'M'){
					m++;
				}else if(ch[count] =='n'|| ch[count] == 'N'){
					n++;
				}else if(ch[count] =='o'|| ch[count] == 'O'){
					o++;
				}else if(ch[count] =='p'|| ch[count] == 'P'){
					p++;
				}else if(ch[count] =='q'|| ch[count] == 'Q'){
					q++;
				}else if(ch[count] =='r'|| ch[count] == 'R'){
					r++;
				}else if(ch[count] =='s'|| ch[count] == 'S'){
					s++;
				}else if(ch[count] =='t'|| ch[count] == 'T'){
					t++;
				}else if(ch[count] =='u'|| ch[count] == 'U'){
					u++;
				}else if(ch[count] =='v'|| ch[count] == 'V'){
					v++;
				}else if(ch[count] =='w'|| ch[count] == 'W'){
					w++;
				}else if(ch[count] =='x'|| ch[count] == 'X'){
					x++;
				}else if(ch[count] =='y'|| ch[count] == 'Y'){
					y++;
				}else if(ch[count] =='z'|| ch[count] == 'Z'){
					z++;
				}
			}
		}
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			System.out.println("e : " + e);
			System.out.println("f : " + f);
			System.out.println("g : " + g);
			System.out.println("h : " + h);
			System.out.println("i : " + i);
			System.out.println("j : " + j);
			System.out.println("k : " + k);
			System.out.println("l : " + l);
			System.out.println("m : " + m);
			System.out.println("n : " + n);
			System.out.println("o : " + o);
			System.out.println("p : " + p);
			System.out.println("q : " + q);
			System.out.println("r : " + r);
			System.out.println("s : " + s);
			System.out.println("t : " + t);
			System.out.println("u : " + u);
			System.out.println("v : " + v);
			System.out.println("w : " + w);
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			System.out.println("z : " + z);
	}
}