import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String [] str1=new String[n];
		String [] str2=new String[n];
		int tarou=0;
		int hanako=0;
		for(int i=0;i<n;i++) {
			str1[i]=sc.next();
			str2[i]=sc.next();
		}
		for(int j=0;j<n;j++) {
			char [] ch1=str1[j].toCharArray();
			char [] ch2=str2[j].toCharArray();
			if(str1[j].length()<=str2[j].length()) {
				char [] ch3=new char[str2[j].length()];
				ch3=str1[j].toCharArray();
				for(int k=0;k<str1[j].length();k++) {
					if(str1[j].length()==str2[j].length()) {
						if(k+1==str1[j].length()&&ch3[k]==ch2[k]) {
							tarou+=1;
							hanako+=1;
						}
						else if(ch3[k]==ch2[k]) {
							continue;
						}
						else if(ch3[k]>ch2[k]) {
							tarou+=3;
							break;
						}
						else if(ch3[k]<ch2[k]) {
							hanako+=3;
							break;
						}
					}
					else {
						if(k+1==str1[j].length()&&ch3[k]==ch2[k]) {
							hanako+=3;
						}
						else if(ch3[k]==ch2[k]) {
							continue;
						}
						else if(ch3[k]>ch2[k]) {
							tarou+=3;
							break;
						}
						else if(ch3[k]<ch2[k]) {
							hanako+=3;
							break;
						}
					}
				}
			}
			else if(str1[j].length()>str2[j].length()) {
				char [] ch3=new char [str1[j].length()];
				ch3=str2[j].toCharArray();
				for(int k=0;k<str2[j].length();k++) {
						if(k+1==str2[j].length()&&ch3[k]==ch1[k]) {
							tarou+=3;
						}
						else if(ch3[k]==ch1[k]) {
							continue;
						}
						else if(ch3[k]>ch1[k]) {
							hanako+=3;
							break;
						}
						else if(ch3[k]<ch1[k]) {
							tarou+=3;
							break;
						}
				}
			}
		}
			System.out.println(tarou+" "+hanako);
		sc.close();
		}

	}
