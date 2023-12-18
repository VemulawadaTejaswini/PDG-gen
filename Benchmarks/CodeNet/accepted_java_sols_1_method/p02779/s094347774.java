import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> num = new ArrayList<Integer>(n);
        boolean judge = true;


        for(int i = 0;i < n;i++){
            num.add(scan.nextInt());
        }

        scan.close();

        Collections.sort(num);

        for(int j = 0; j < n-1;j++){
            if(num.get(j).equals(num.get(j+1))) judge = false;
        }

        if(judge) System.out.println("YES");
        else System.out.println("NO");
    }
}