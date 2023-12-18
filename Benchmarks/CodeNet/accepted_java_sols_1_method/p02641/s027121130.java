import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        ArrayList<Integer> p = new ArrayList();
        for (int i = 0; i < n; i++) {
            p.add(input.nextInt());
        }
        int left=x-1, right=x+1;

        Collections.sort(p);
        if(!p.contains(x)){
            System.out.print(x);
        }else{
            for(int i=0; i<n; i++){
                if(p.contains(left)){
                    left--;
                }
                if(p.contains(right)){
                    right++;
                }
                if(!p.contains(left)&&!p.contains(right)){
                    if(Math.abs(x-left)>Math.abs(x-right)){
                        System.out.print(right);
                        
                        return;
                    }else{
                        System.out.print(left);
                        return;
                    }
                }
            }
        }
    }
}