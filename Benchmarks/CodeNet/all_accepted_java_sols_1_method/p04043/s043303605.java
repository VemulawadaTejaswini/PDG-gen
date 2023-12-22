import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    String[] strArray = str.split(" ");

    int cntFive = 0;
    int cntSeven = 0;
	
    for (int i = 0; i < strArray.length; i++){
      if(!strArray[i].equals("5") && !strArray[i].equals("7")){
        System.out.print("NO");
        return;
      }else{
        if(strArray[i].equals("5")){
          cntFive++;
        }else{
          cntSeven++;
        }
      }
    }
    if(cntFive != 2 || cntSeven != 1){
        System.out.print("NO");
    }else{
        System.out.print("YES");
    }
  }
}