import java.util.*;

public class Main {

	public static void main(String[] args) {
		int i,j;
		String input;
		int count=0;
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for(i=0;i<n;i++){
			input=s.next();
			int k=0;
			for(j=0;j<input.length();j++){
				int ch = input.charAt(j)-'0';


				if(ch==0){
					switch(k){
					case 1:
						if(count%5==1) System.out.print(".");
						else if(count%5==2) System.out.print(",");
						else if(count%5==3) System.out.print("!");
						else if(count%5==4) System.out.print("?");
						else System.out.print(" ");
						break;
					case 2:
						if(count%3==1) System.out.print("a");
						else if(count%3==2) System.out.print("b");
						else System.out.print("c");
						break;
					case 3:
						if(count%3==1) System.out.print("d");
						else if(count%3==2) System.out.print("e");
						else System.out.print("f");
						break;
					case 4:
						if(count%3==1) System.out.print("g");
						else if(count%3==2) System.out.print("h");
						else System.out.print("i");
						break;
					case 5:
						if(count%3==1) System.out.print("j");
						else if(count%3==2) System.out.print("k");
						else System.out.print("l");
						break;
					case 6:
						if(count%3==1) System.out.print("m");
						else if(count%3==2) System.out.print("n");
						else System.out.print("o");
						break;
					case 7:
						if(count%4==1) System.out.print("p");
						else if(count%4==2) System.out.print("q");
						else if(count%4==3) System.out.print("r");
						else System.out.print("s");
						break;
					case 8:
						if(count%3==1) System.out.print("t");
						else if(count%3==2) System.out.print("u");
						else System.out.print("v");
						break;
					case 9:
						if(count%4==1) System.out.print("w");
						else if(count%4==2) System.out.print("x");
						else if(count%4==3) System.out.print("y");
						else System.out.print("z");
						break;
					case 0:
						break;
					}
					count=0;
					k=0;

				}else{
				k=ch;
				count++;
				}
			}
			System.out.println();


		}

	}

}