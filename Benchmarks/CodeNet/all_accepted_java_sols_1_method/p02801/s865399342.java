import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String c0=sc.next();
        char[] c1=c0.toCharArray();

        char alphabet[]=new char[26];
        char c='a';
        for(int i=0; i<26; i++){
            alphabet[i]=c++;
        }
        for(int j=0; j<26; j++){
            if(c1[0]==alphabet[j]){
                System.out.println(alphabet[j+1]);
                break;
            }
        }
        sc.close();
    }
}