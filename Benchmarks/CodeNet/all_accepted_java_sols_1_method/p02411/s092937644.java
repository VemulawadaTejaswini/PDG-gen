import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> m_list = new ArrayList<>();
        ArrayList<Integer> f_list = new ArrayList<>();
        ArrayList<Integer> r_list = new ArrayList<>();

        int m;
        int f;
        int r;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] line = br.readLine().split(" ");
            m = Integer.parseInt(line[0]);
            f = Integer.parseInt(line[1]);
            r = Integer.parseInt(line[2]);

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            m_list.add(m);
            f_list.add(f);
            r_list.add(r);

        }

        for (int i = 0; i < m_list.size(); i++) {
            
            if(m_list.get(i) == -1 || f_list.get(i) == -1){
                System.out.println("F");
            }
            else {
                
                if(m_list.get(i) + f_list.get(i) >= 80) System.out.println("A");
                
                if(65 <= m_list.get(i) + f_list.get(i) && 
                        m_list.get(i) + f_list.get(i) < 80) System.out.println("B");
                
                if(50 <= m_list.get(i) + f_list.get(i) && 
                        m_list.get(i) + f_list.get(i) < 65) System.out.println("C");
                
                if(30 <= m_list.get(i) + f_list.get(i) && 
                        m_list.get(i) + f_list.get(i) < 50) {
                    
                    if(r_list.get(i) >= 50) { System.out.println("C"); }
                    else { System.out.println("D"); }
                    
                }
                
                if(m_list.get(i) + f_list.get(i) < 30) System.out.println("F");
                
            }
            
        }
        

    }

}