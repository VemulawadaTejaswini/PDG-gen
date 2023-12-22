import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<String> A = new ArrayList<String>(Arrays.asList(sc.next().split("")));
        List<String> B = new ArrayList<String>(Arrays.asList(sc.next().split("")));
        List<String> C = new ArrayList<String>(Arrays.asList(sc.next().split("")));
        
        int i=0;
        int num = 1;
        while(true){
            switch(num){
                case 1:
                    if(A.size() > 0){
                        num = selectTurn(A.get(0));
                        A.remove(0);
                    }else{
                        System.out.println("A");
                        return;
                    }
                    break;
                case 2:
                    if(B.size() > 0){
                        num = selectTurn(B.get(0));
                        B.remove(0);
                    }else{
                        System.out.println("B");
                        return;
                    }
                    break;
                case 3:
                    if(C.size() > 0){
                        num = selectTurn(C.get(0));
                        C.remove(0);
                    }else{
                        System.out.println("C");
                        return;
                    }
                    break;
            }
        }
    }
    
    public static int selectTurn(String s){
        if(s.equals("a")){
            return 1;
        }
        if(s.equals("b")){
            return 2;
        }
        if(s.equals("c")){
            return 3;
        }
        return 0;
    }
}