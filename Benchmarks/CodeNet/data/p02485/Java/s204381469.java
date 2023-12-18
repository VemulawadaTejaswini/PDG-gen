import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Main {
  public static void main(final String... args) {
    try {
      InputStreamReader _inputStreamReader = new InputStreamReader(System.in);
      BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
      final BufferedReader br = _bufferedReader;
      String str = br.readLine();
      boolean _notEquals = (!Objects.equal(str, "0"));
      boolean _while = _notEquals;
      while (_while) {
        {
          final char[] s = str.toCharArray();
          int ans = 0;
          for (final char c : s) {
            int _minus = (c - '0');
            int _plus = (ans + _minus);
            ans = _plus;
          }
          System.out.println(ans);
        }
        boolean _notEquals_1 = (!Objects.equal(str, "0"));
        _while = _notEquals_1;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}