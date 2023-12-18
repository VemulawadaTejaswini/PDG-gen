import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(Exception e){
                break;
            }
            String[] linesp = line.split(" ");
            double p0x = Double.parseDouble(linesp[0]);
            double p0y = Double.parseDouble(linesp[1]);
            double p1x = Double.parseDouble(linesp[2]);
            double p1y = Double.parseDouble(linesp[3]);
            double p2x = Double.parseDouble(linesp[4]);
            double p2y = Double.parseDouble(linesp[5]);
            double px = Double.parseDouble(linesp[6]);
            double py = Double.parseDouble(linesp[7]);
            
            double Area = 0.5 *(-p1y*p2x + p0y*(-p1x + p2x) + p0x*(p1y - p2y) + p1x*p2y);
            double s = 1/(2*Area)*(p0y*p2x - p0x*p2y + (p2y - p0y)*px + (p0x - p2x)*py);
            double t = 1/(2*Area)*(p0x*p1y - p0y*p1x + (p0y - p1y)*px + (p1x - p0x)*py);
            if((0 < s && s < 1) && (0 < t && t < 1) && (0 < 1-s-t && 1-s-t < 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            } 
        }    
    }
}

