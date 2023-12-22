import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list=new ArrayList<>();
        List<Integer> hana=new ArrayList<>();
        int count=0;
        
        for(int i=0;i<a;i++){
            int h=sc.nextInt();
            list.add(h);
            hana.add(0);
        }
        
        for(int i=0;i<a;i++){
                for(int t=0;t<list.get(i);t++){
                    if(hana.get(i)<list.get(i)){
                        hana.set(i, hana.get(i)+1);
                        if(i+1==list.size()){

                        }else{
                            if(hana.get(i+1)<list.get(i+1)){
                                for(int x=i+1;x<a;x++){
                                    if(hana.get(x)<list.get(x)){
                                        hana.set(x,hana.get(x)+1);
                                    }else{
                                        break;
                                    }
                                }
                            }
                        }
                        count+=1;
                    }else{
                        break;
                    }
                }
        }
        System.out.println(count);
        
        
    }
}
