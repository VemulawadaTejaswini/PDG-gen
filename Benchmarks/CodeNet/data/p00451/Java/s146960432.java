import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      char[] s1 = sc.next().toCharArray();
      char[] s2 = sc.next().toCharArray();
      int len1 = s1.length;
      int len2 = s2.length;

      //intテ・ツ楪凝」ツ?ァ, 4000*4000テ」ツつ津ァツ「ツコテ、ツソツ敕」ツ?凖」ツつ?-> MLE
      //shortテ・ツ楪凝」ツ?繰avaテ」ツ?ァテ、ツスツ陛」ツδ静」ツつ、テ」ツδ暗」ツ?凝、ツクツ催ヲツ伉偲」ツ??」ツ?古ィツゥツヲテ」ツ??-> MLE
      //テ、ツサツ陛ヲツ鳴ケテ」ツ?古」ツ?ェテ」ツ??」ツ?ョテ」ツ?ァテ」ツ??ゥツ?催・ツ按療ッツシツ妥ィツ。ツ古」ツつ津、ツスツソテ」ツ??・ツ崢榲」ツ?凖・ツスツ「テ」ツ?ォ
      short[][] dp = new short[2][len2 + 1];
      short maxLen = 0;

      for(int idx1 = 0; idx1 < len1; idx1++){
        int i = idx1 % 2;
        int ni = (i + 1) % 2;

        Arrays.fill(dp[ni], (short)0);

        for(int idx2 = 0; idx2 < len2; idx2++){
          if(s1[idx1] == s2[idx2]){
            dp[ni][idx2 + 1] = (short)(dp[i][idx2] + 1);
            maxLen = (short)Math.max(maxLen, dp[ni][idx2 + 1]);
          }
        }
      }

      System.out.println(maxLen);
    }
  }
}