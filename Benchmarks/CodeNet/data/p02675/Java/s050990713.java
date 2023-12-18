class Main {
 
  public static void main(String[] args){
    String N = args[0];
    String str = N.substr(0,1);
    String[] ponArr = new String[]{"0","1","6","8"};
    String[] bonArr = new String[]{"3"};
    if(ponArr.contains(str)){
      System.out.println("pon");
    }else if(bonArr.contains(str)){
      System.out.println("bon");
    }else{
      System.out.println("hon");
    }
  }
}