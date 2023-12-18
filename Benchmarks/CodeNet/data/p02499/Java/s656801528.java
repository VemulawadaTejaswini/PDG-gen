import java.io.*;

public class Main{
 public static void main(String[] args){
  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
  String phrase;
  try{
  do{
  phrase =reader.readLine();
   int[] alphabet =new int[26];
   //Search the length of the phrase
   for(int i=0;i<phrase.length();i++){
    char word =phrase.charAt(i);   //sesrch each case
    int word_s=(int)word-(int)'a'; //For counting lowercase
    int word_C=(int)word-(int)'A'; //For counting capitalcase
    //If a case in the phrase is "j"st alphabet,add 1 to the counter of it
    for(int j=0;j<26;j++){
     if(word_s==j||word_C==j){
      alphabet[j]++;
     }
   }
 }while(phrase!=null);
    //Output the result (use ASCII code)
    for(int k=0;k<26;k++){
     System.out.println((char)(97+k)+" : "+alphabet[k]);
    }
  }catch(IOException e){
   System.out.println(e);
  }
}
}