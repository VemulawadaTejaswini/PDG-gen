import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words1, words2;
        int wordl,result,score1=0,score2=0;
        int n=scan.nextInt();
        
        for(int i=0; i<n; i++){
            result=0;
            words1=scan.next();
            words2=scan.next();
            
            wordl=Math.min(words1.length(), words2.length());
            for(int j=0; j<wordl; j++){
                if(words1.substring(j,j+1).compareTo(words2.substring(j,j+1))!=0){
                    result=words1.substring(j,j+1).compareTo(words2.substring(j,j+1));
                    break;
                }
            }
            if(result>0)score1+=3;
            else if(result==0){
                if(words1.length()>words2.length())score1+=3;
                else if(words1.length()<words2.length())score2+=3;
                else{
                    score1++;
                    score2++;
                }
            }else score2+=3;
        }
        System.out.println(score1+" "+score2);
    }
}
