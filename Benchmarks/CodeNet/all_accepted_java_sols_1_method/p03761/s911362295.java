


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		String a="";

		int[][] chars=new int[kosu+1][26];

		for(int i=0; i<=kosu; i++) {
			for(int j=0; j<26; j++) {
				chars[i][j]=0;
			}
		}

		for(int i=0; i<kosu; i++) {
			a=sc.next();
			for(int j=0; j<a.length(); j++) {
				chars[i][a.charAt(j)*1-97]++;
			}
		}

		String b="";

		for(int i=0; i<26; i++) {
			int tmp=114514810;
			for(int j=0; j<kosu; j++) {
				tmp=Math.min(tmp,chars[j][i] );
			}
			chars[kosu][i]=tmp;
			if(chars[kosu][i]>0) {
				char unko=(char) ('a'+i);
				for(int k=0; k<chars[kosu][i]; k++) {
					b=b+unko+"";
				}
			}
		}
		System.out.println(b);
	}
}