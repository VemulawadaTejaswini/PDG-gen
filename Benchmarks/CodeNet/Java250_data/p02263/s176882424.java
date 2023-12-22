import java.util.Scanner;

class Main{
  String[] data = new String[200];
  int num;

  Main(){
    this.num = 0;
  }

  boolean push(String c){
    if(this.isFull())
      return false;
    else{
      this.data[++num] = c;
      return true;
    }
  }

  String pop(){
    return this.data[num--];
  }

  boolean isFull(){
    return num == 199;
  }

  boolean isEmpty(){
    return num == 0;
  }


  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int ans;
    int ope1, ope2;
    Main stack = new Main();

    while(stdIn.hasNext()){
      String input = stdIn.next();
      if(input.equals("+") || input.equals("-") || input.equals("*")){
        ope2 = Integer.parseInt(stack.pop());
        ope1 = Integer.parseInt(stack.pop());
          if(input.equals("+"))
            ans = ope1 + ope2;
          else if(input.equals("-"))
            ans = ope1 - ope2;
          else
            ans = ope1 * ope2;
        stack.push(Integer.toString(ans));
      }
      else{
        stack.push(input);
      }
    }

  
    System.out.println(stack.pop());
  }
}