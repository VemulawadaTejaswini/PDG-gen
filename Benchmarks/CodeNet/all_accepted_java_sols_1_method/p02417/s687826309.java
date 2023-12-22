import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s="0",s2="0";
        while(sc.hasNext()){
        	s2=sc.nextLine();
            s=s.concat(s2);
        	
        }
        s=s.toLowerCase();
        char []c=new char[26];
        int []count=new int[26];
        char code=97;
        for(int i=0;i<26;i++){
            c[i]=code++;
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<26;j++){
            	if(c[j]==s.charAt(i)){
                    count[j]++;
            	}
            }
        }
        for(int i=0;i<count.length;i++){
            System.out.println(c[i]+" : "+count[i]);
        }
    }
}
