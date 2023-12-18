public class Main {
 
    public static void main(String[] args) {
         
    t = int(raw_input())
    h = t / 3600
    m = (t - 3600 * h) / 60
    s = t % 60
    print('{0}:{1}:{2}'.format(h, m, s))
          
        sc.close();
 
    }
 
}
