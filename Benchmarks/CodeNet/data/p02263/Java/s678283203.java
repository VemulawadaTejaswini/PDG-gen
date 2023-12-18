import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] num = line.split(" "); //空白で分けて格納してくれる.split()
        Deque<Integer> stack = new ArrayDeque<Integer>(); //スタックを作成する、中身はIntegerなので文字列は厳しい？
        sc.close();
        for(int i = 0; i < num.length; i++){
            if(num[i].equals("+")){    //Stringはequalsを使わなければ比べられない
                int x = stack.remove(); //popまたはremove()で取り出し
                int y = stack.remove();
                stack.push(y + x);
            }
            else if(num[i].equals("-")){
                int x = stack.remove();
                int y = stack.remove();
                stack.push(y - x);
            }
            else if(num[i].equals("*")){
                int x = stack.remove();
                int y = stack.remove();
                stack.push(y * x);
            }
            else 
                stack.push(Integer.parseInt(num[i]));//スタックに格納する前にIntegerに変換
            
        }
        System.out.println(stack.remove());
    }
}
