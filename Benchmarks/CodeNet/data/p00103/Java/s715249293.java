import java.util.*;

class Main{
  public static void main(String[] args){
  ArrayList<String> hit   = new ArrayList<String>();
  int score = 0;
  Scanner in = new Scanner(System.in);
  while (in.hasNext()){
  String str = in.nextLine();
  //??\?????§HIT,Out,HOMERUN??????????????????
  if (str.equals("HIT")){
    if (hit.size() < 4){
      hit.add("1");
    }else{
      score += 1;
    }
  }else if(str.equals("HOMERUN")){
    score += hit.size() + 1;
    hit.clear();
  }else if(str.equals("OUT")){
    System.out.println(score);
    hit.clear();
    score = 0;
  }
  System.out.println(score);
  }
  }
}