import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");
		int n = Integer.parseInt(sl[0]);
        int k = Integer.parseInt(sl[1]);
      	s = r.readLine();
		sl = s.split(" ");
      	int a[] = new int[50];
      	for(int i = 0; i < n; i++)
        {
          a[i] = Integer.parseInt(sl[i]);
        }
      	
        int vmax = 0;
      	int minkn = Math.min(k, n);
        for(int i = 1; i <= minkn; i++)
        {
          int js[] = new int[i];
          for(int j = 0; j <= i; j++)
          {
            int v = 0;
            for(int l = 0; l < j; l++)
            {
              js[l] = a[l];
            }
            for(int l = 0; l < i - j; l++)
            {
              js[i - 1 - l] = a[n - 1 - l];
            }
            Arrays.sort(js);
            int kii = Math.min(k - i, i);
            int z = 0;
            for(z = 0; z < kii; z++)
            {
              if(js[z] >= 0) break;
            }
            for(; z < i; z++)
            {
              v += js[z];
            }
            vmax = Math.max(v, vmax);
          }
        }
        System.out.println(vmax);
	}
}
